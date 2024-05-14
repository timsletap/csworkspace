package Trees;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;


public class MorseTree {


	BinarySearchTree data;
	
	String letters =   "0_9O .8M Q G Z7T Y K C N X D B6/1J W P A   R L E2- U F I3V S4H5";
	public MorseTree() {
		
		char[] arr = letters.toCharArray();
		data = new BinarySearchTree();
		data.setRoot(balance(arr));
		
		
	}




	public static TreeNode balance(char arr[]) {
		  return balance(arr, 0, arr.length-1);
		}	

	
	private static TreeNode balance(char arr[], int start, int end) { 
			if (start > end) return null;
			// same as (start+end)/2, avoids overflow
			int mid = start + (end - start) / 2;
			@SuppressWarnings("rawtypes")
			TreeNode node = new TreeNode(new Morse( mid, arr[mid]));
			node.setLeft(balance(arr, start, mid-1));
			node.setRight(balance(arr, mid+1, end));
			return node;
		  }


	
	public void display() {
		data.inOrder();
	}

	

	public String convertMorsetoLetter(String morse) {
		String convert = "";
		TreeNode node = data.getRoot();
        for (char c : morse.toCharArray()) {
            if (node == null) {
                return " ";
            }
            if (c == '.') {
                node = node.getLeft();
            } else if (c == '-') {
                node = node.getRight();
            }
			convert += ((Morse) node.getValue()).getCharacter();
        }
        if (node == null) {
            return " ";
        } else {
            return convert;
        }
    }





	

	

	
	    public static void playNote(MidiChannel channel, int note, int volume, int duration)
	            throws InterruptedException
	    {
	        channel.noteOn(note, volume);
	        Thread.sleep(duration);

	        channel.noteOff(note);
	    }

	    /* Plays the dots and dashes */
	    public static void playMorse(String morse) throws MidiUnavailableException, InterruptedException
	    {
	        Synthesizer synth = MidiSystem.getSynthesizer();
	        synth.open();

	        MidiChannel[] channels = synth.getChannels();
	        Instrument[] instruments = synth.getDefaultSoundbank().getInstruments();

	       for (MidiChannel x: channels)
	    		   System.out.println(x);
	        /* Channel 0 is an acoustic grand piano */
	        MidiChannel grandPiano = channels[8];
	        grandPiano.programChange(instruments[4].getPatch().getProgram());

	        /* Max volume (0-127 is the range) */
	        int volume = 80;

	        /* 440Hz (Concert A) */
	        int midiNote = 69;

	        /* Wait a bit (stops a squeaking sound from the MIDI)
	         * to give the synthesizer time to get read */

	        Thread.sleep(100);

	        /* Plays the note (duration depends on dot vs dash)
	         * followed by a [very] short pause */

	        for(char symbol : morse.toCharArray())
	        {
	            if(symbol == '.')
	            {
	                playNote(grandPiano, midiNote, volume, 100);
	                Thread.sleep(50);
	            }
	            else if(symbol == '-')
	            {
	                playNote(grandPiano, midiNote, volume, 200);
	                Thread.sleep(50);
	            }
	            else if(symbol == ' ')
	            {
	                /* Longer pause */
	                Thread.sleep(300);
	            }
	            else
	            {
	                /* Invalid character encountered */
	                System.out.println("Error! Invalid character");
	                synth.close();

	                return;
	            }
	        }

	        /* Wait 500ms to let the synthesizer finish up
	         * (flush last note, etc.) before closing */

	        Thread.sleep(500);
	        synth.close();
	    }

	   
	public static void main(String[] args)  throws Exception {
		MorseTree tc = new MorseTree();
		 playMorse("... --- ... ... --- ... ... --- ... ... --- ... ... --- ... ... --- ...");
		 


	}

	
	
	
}