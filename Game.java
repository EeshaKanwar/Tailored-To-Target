//Eesha Kanwar
//October 19, 2018
//Game to save the Human from a chronic disease by going inside its body.

import java.util.*;
import java.text.*;
import javax.swing.*;

public class RPG
{    
	public static void main(String args[])
	{
		Date now = new Date ();
		DateFormat df = DateFormat.getDateInstance ();
		String s = df.format (now);
		System.out.println ("Today is " + s + ".");

		new RPG ();
	}

	public RPG ()
	{ conclusion();
	System.out.println ("");
	System.out.println("  _____      _                    _______    _ _                    _   _          _______                   _   ");
	System.out.println(" / ____|    (_)               _  |__   __|  (_) |                  | | | |        |__   __|                 | |  ");
	System.out.println("| |     _ __ _ ___ _ __  _ __(_)    | | __ _ _| | ___  _ __ ___  __| | | |_ ___      | | __ _ _ __ __ _  ___| |_ ");
	System.out.println("| |    | '__| / __| '_ \\| '__|      | |/ _` | | |/ _ \\| '__/ _ \\/ _` | | __/ _ \\     | |/ _` | '__/ _` |/ _ \\ __|");
	System.out.println("| |____| |  | \\__ \\ |_) | |   _     | | (_| | | | (_) | | |  __/ (_| | | || (_) |    | | (_| | | | (_| |  __/ |_ ");
	System.out.println(" \\_____|_|  |_|___/ .__/|_|  (_)    |_|\\__,_|_|_|\\___/|_|  \\___|\\__,_|  \\__\\___/     |_|\\__,_|_|  \\__, |\\___|\\__|");
	System.out.println("                  | |                                                                              __/ |         ");
	System.out.println("                  |_|                                                                             |___/          ");
	System.out.println("");
	System.out.println("____");
	System.out.println("\\___\\_.:::::::.___");
	System.out.println("/___/ ':::::::'   ");
	System.out.println("");


	introduction ();
	}

	public void introduction ()
	{
		//BackStory that introduces to the player what they are required to do in the game.
		IO.printSlow ("Welcome to the game Tailored to Target! You are a CRISPR:",15);
		IO.printSlow ("\nA segment of DNA containing short repetitions of base sequences,involved in the defense mechanisms of human body.",15);
		IO.printSlow ("You have the ability  to change the human's DNA which can be good for the body.",15);
		IO.printSlow ("But, it can also go wrong and become deadly, and you might end up killing the human.",15);
		IO.printSlow ("So, Your task as the CRISPR is to first find problems within the body and then, make good mutations so that person's chronic and genetic diseases can be cured.",15);
		System.out.println ("");
		Castle ();
	}

	public void Castle ()
	/* The player has to find what is wrong in the body, so he has to go through different parts of it to figure it out.*/
	{
		Outside ();
	}

	public void Outside ()
	{
		System.out.println ("You are outside the body.");
		System.out.println ("");
		System.out.println ("          ///^\\\\\\");
		System.out.println ("         | ^   ^ |");
		System.out.println ("        @ (o) (o) @");
		System.out.println ("         |   <   |");
		System.out.println ("         |  ___  |");
		System.out.println ("          \\_____/");
		System.out.println ("       ____|  |____");
		System.out.println ("      / /  \\__/  \\ \\");
		System.out.println ("     / /          \\ \\");
		System.out.println ("    / / |        | \\ \\");
		System.out.println ("   / /  |        |  \\ \\");
		System.out.println ("  ( <   |        |   > )");
		System.out.println ("   \\ \\  |        |  / /");
		System.out.println ("    \\ \\ |________| / /");
		System.out.println ("     \\ \\|<I_D_I__|/ /");
		System.out.println ("      \\ \\// I  \\ / /");
		System.out.println ("       \\//  I   \\ /");
		System.out.println ("       |         |");
		System.out.println ("       |    |    |");
		System.out.println ("       |    |    |");
		System.out.println ("       |    |    |");
		System.out.println ("       |    |    |");
		System.out.println ("       | ## | ## |");
		System.out.println ("       |    |    |");
		System.out.println ("       |    |    |");
		System.out.println ("       |____|____|");
		System.out.println ("       (____(____)");
		System.out.println ("       _| | _| |  ");
		System.out.println ("    cccC__Cccc___)");
		System.out.println ("");
		char where = IO.inputChar ("\nDo you want to go Inside? (y/n) ");
		if (where == 'y')
			blood ();
		else
			System.out.println ("Good bye! You gave up before the game started.");
	}

	public void blood ()
	//Crispr has to go inside the body through an injection 
	{
		System.out.println("");
		System.out.println("      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    ");
		System.out.println("       |-|  |?-------------llll !|  | ");
		System.out.println(" 000- |-|...|   |?++++?++++?++++??-- | ? ? ?----- ");
		System.out.println("       |-|  |?-------------llll !|  |  ");
		System.out.println("      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		IO.printSlow("You are being Injected inside the body.",50);

		System.out.println ("\nNow, You are in the blood of the human.");//Once inside, they choose where to go and check the body parts to see if they are functioning properly.
		char where = IO.inputChar ("Would you like to go in the Liver(l) or Heart(b)? ");
		if (where == 'l')
			Liver ();
		else 
			Heart ();
	}

	public void Liver ()
	{
		System.out.println ("\nYou are in the liver.");
		char where = IO.inputChar ("Would you like to go in the Small intestine (s) or Spleeen (i)? ");
		if (where == 's')
			small();
		else
			spleen ();
	}

	public void spleen ()
	{
		System.out.println ("\nYou are in the spleen.");
		char where = IO.inputChar ("Would you like to go in the Liver (l) or Lungs (s)? ");
		if (where == 'l')

			Liver ();
		else
			lungs ();
	}

	public void small ()
	{
		System.out.println ("\nYou are in the small intestine.");
		char where = IO.inputChar ("Would you like to go in the Urinary Bladder (u) or Stomach (d)? ");
		if (where == 'u')

			UrinaryBlad ();
		else
			stomach ();
	}
	public void UrinaryBlad ()
	{
		System.out.println ("\nYou are in the Urinary Bladder.");
		char where = IO.inputChar ("Would you like to go in the Stomach (d) or Lungs (s)? ");
		if (where == 'd')

			stomach ();
		else
			lungs ();
	}

	public void stomach ()
	{
		System.out.println ("\nYou are in the Stomach.");
		char where = IO.inputChar ("Would you like to go in the Brain (k) or Lungs (s)? ");
		if (where == 'k')

			brain ();
		else
			lungs ();
	}

	public void lungs ()
	{
		System.out.println ("\nYou are in the lungs.");
		char where = IO.inputChar ("Would you like to go in the Heart (b) or Brain (k)? ");
		if (where == 'b')
			Heart ();
		else
			brain ();
	}

	public void Heart ()
	{
		System.out.println ("\nYou are in Heart.");
		char where = IO.inputChar ("Would you like to go in the Brain(k) or Small intestines (s)? ");
		if (where == 'k')
			brain ();
		else
			small ();
	}

	public void brain ()
	//They will keep choosing the above body parts until they finally choose brain where the first task is.
	{
		System.out.println("");
		System.out.println("It's a long way.... You're being transferred as fast as you can.");
		System.out.println("");
		IO.printSlow ("########  ########     ###    #### ##    ##",10); 
		IO.printSlow ("##     ## ##     ##   ## ##    ##  ###   ##",10);
		IO.printSlow ("##     ## ##     ##  ##   ##   ##  ####  ##",10);
		IO.printSlow ("########  ########  ##     ##  ##  ## ## ##",10);
		IO.printSlow ("##     ## ##   ##   #########  ##  ##  ####",10);
		IO.printSlow ("##     ## ##    ##  ##     ##  ##  ##   ###",10);
		IO.printSlow ("########  ##     ## ##     ## #### ##    ##",10);
		System.out.println("");
		System.out.println("       _---~~(~~-_.");
		System.out.println("     _{        )   )");
		System.out.println("   ,   ) -~~- ( ,-' )_");
		System.out.println("  (  `-,_..`., )-- '_,)");
		System.out.println(" ( ` _)  (  -~( -_ `,  }");
		System.out.println(" (_-  _  ~_-~~~~`,  ,' )");
		System.out.println("   `~ -^(    __;-,((()))");
		System.out.println("         ~~~~ {_ -_(())");
		System.out.println("                `\\  }");
		System.out.println("                  { }");
		System.out.println("");
		System.out.println("\nYou made it in the Brain, and there is Blockage here as the person has Brain Hemorrhage.");
		System.out.println("Therefore you should cure it before moving forward.");
		task1 ();
	}

	public void task1 ()
	//Once they reach here, they will be given a multiple choice question that they have to answer to pass the task.
	{
		//start and end variables for timer
		Date now, end;
		//Start the timer
		now = new Date ();
		int sec1 = now.getSeconds ();
		int min1 = now.getMinutes ();

		IO.printSlow ("\nCongratulations! You have found the first hinderance.",15);
		IO.printSlow ("\nNow, to cure the brain Hemorrhage, the human must take the medicine given to him by the doctor.",15);
		IO.printSlow ("But the problem is that he does'nt remember what medicine it was, your task is to help him choose the correct medicine to advance to the next part of the game.",15);
		IO.printSlow ("Keep in mind that if you answer wrong and make the human take the wrong medicine; he can die.",15);
		IO.printSlow ("And you will have to start the game all over again.You only have three tries.",15);
		System.out.println ("");
		IO.printSlow ("\nHe has the following medicines in his medicone box:-",15);
		System.out.println ("");
		IO.printSlow ("(a) Benicar HCT (hydrochlorothiazide and olmesartan) ",15);
		IO.printSlow ("(b) Tylenol ",15);
		IO.printSlow ("(c) Temozolomide ",15);//right answer
		IO.printSlow ("(d) Caduet (amlodipine and atorvastatin)",15);
		IO.printSlow ("(e) Aspirin ");
		IO.printSlow ("(f) Isonate (isosorbide dinitrate)",15);
		System.out.println ("");
		IO.printSlow ("Which of the above medicine his body requires to get rid of the tumor? (There is only one right answer)",15);

		String ans = IO.inputString ("a/b/c/d/e/f? ");

		System.out.println ("\nYou answered: " + ans);
		int tries = 0; 

		//loop until they get it OR 3 tries
		while (!ans.equalsIgnoreCase ("c") && tries < 2) 
		{ 
			System.out.println ("\nNope, Try Again");
			//Show an error dialog that displays the message, 'Nope, try again.':
			JOptionPane.showMessageDialog (null, "Nope, Try Again.", "WRONG", JOptionPane.ERROR_MESSAGE);
			//Ask again
			System.out.println ("\n(a) Benicar HCT (hydrochlorothiazide and olmesartan) ");
			System.out.println ("(b) Tylenol ");
			System.out.println ("(c) Temozolomide ");//right answer
			System.out.println ("(d) Caduet (amlodipine and atorvastatin)");
			System.out.println ("(e) Aspirin ");
			System.out.println ("(f) Isonate (isosorbide dinitrate) ");
			ans = IO.inputString ("\nWhich of the above medicine his body requires to get rid of the tumor? (There is only one right answer) "); 
			tries++; 
		}
		//Tell them if right or wrong
		if (ans.equalsIgnoreCase ("c")) {
			System.out.println ("\nYou got it!");
			//End the timer
			end = new Date ();
			int sec2 = end.getSeconds ();
			int min2 = end.getMinutes ();
			//Calculate time: move on if quick enough
			int elapsed_sec = (min2 * 60 + sec2) - (min1 * 60 + sec1);
			if(elapsed_sec<120) {
				IO.printSlow ("\nExcellent. You completed that quickly.",15);
			}
			System.out.println ("");
			System.out.println ("       _,,,,,,,_");
			System.out.println ("     ,88888888888,");
			System.out.println ("   ,888'       `888,");
			System.out.println ("   888' 0     0 `888");
			System.out.println ("  888             888");
			System.out.println ("  888      0      888");
			System.out.println ("  888  0,     ,0  888");
			System.out.println ("   888,  00000  ,888");
			System.out.println ("    '888,      ,888'");
			System.out.println ("      '8JGS8888888'");
			System.out.println ("        ````````");
			System.out.println ("");
			IO.printSlow ("Good job. You move on.",15);
			castle ();
		}
		else
		{	//End the timer
			end = new Date ();
			int sec2 = end.getSeconds ();
			int min2 = end.getMinutes ();
			//Calculate time: move on if quick enough
			int elapsed_sec = (min2 * 60 + sec2) - (min1 * 60 + sec1);
			if(elapsed_sec<120) {
				IO.printSlow ("\nSadly, you took too long and could not give the right answer.",15);
			}
			System.out.println ("\nYou failed to give the right answer in the given time. As a result the human has died.");
			System.out.println ("");
			System.out.println ("     _,,,,,,,_ ");
			System.out.println ("  ,88888888888, ");
			System.out.println (" ,888'       `888, ");
			System.out.println (" 888' 0     0 `888 ");
			System.out.println ("888      0      888 ");
			System.out.println ("888             888 ");
			System.out.println ("888    ,000,    888 ");
			System.out.println (" 888, 0     0 ,888 ");
			System.out.println ("' 888,       ,888' ");
			System.out.println ("   '8JGS8888888' ");
			System.out.println ("      ```````` ");
			System.out.println ("");
			IO.printSlow ("Try the task again.",15);
			Castle();
		}

	}
	public void castle ()
	//If they clear the first task, they will have to find the next body part that has problem.
	{
		BRAIN ();
	}

	public void BRAIN ()
	{
		IO.printSlow ("\nYou are at present inside the brain you just cured.",15);
		System.out.println("       _---~~(~~-_.");
		System.out.println("     _{        )   )");
		System.out.println("   ,   ) -~~- ( ,-' )_");
		System.out.println("  (  `-,_..`., )-- '_,)");
		System.out.println(" ( ` _)  (  -~( -_ `,  }");
		System.out.println(" (_-  _  ~_-~~~~`,  ,' )");
		System.out.println("   `~ -^(    __;-,((()))");
		System.out.println("         ~~~~ {_ -_(())");
		System.out.println("                `\\  }");
		System.out.println("                  { }");
		System.out.println("");

		char where = IO.inputChar ("Would you like to go in the Pancreas (p) or Large intestines (v)? ");
		if (where == 'p')
			pancreas ();
		else
			largeIntestine ();
	}

	public void pancreas ()
	{
		System.out.println ("\nYou are in the Pancreas.");
		char where = IO.inputChar ("Would you like to go in the Arteries (q) or Veins (x)? ");
		if (where == 'q')

			Arteries ();
		else
			Veins ();
	}

	public void largeIntestine ()
	{
		System.out.println ("\nYou are in the large intestines.");
		char where = IO.inputChar ("Would you like to go in the Larynx (y) or Kidney (z)? ");
		if (where == 'y')

			Larynx ();
		else
			Kidney ();
	}

	public void Arteries ()
	{
		System.out.println ("\nYou are in the Arteries.");
		char where = IO.inputChar ("Would you like to go in the White blood cells (W) or Red Blood cells (R)? ");
		if (where == 'W')

			WBC ();
		else
			RBC ();
	}

	public void Veins ()
	{
		System.out.println ("\nYou are in the Veins.");
		char where = IO.inputChar ("Would you like to go in the Kidney (z) or Arteries (q)? ");
		if (where == 'z')

			Kidney ();
		else
			Arteries ();
	}

	public void Larynx ()
	{
		System.out.println ("\nYou are in the Larynx");
		char where = IO.inputChar ("Would you like to go in the White Blood Cells (W) or Pancreas (p)? ");
		if (where == 'W')

			WBC ();
		else
			pancreas ();
	}

	public void WBC ()
	{
		System.out.println ("\nYou are inside White Blood Cells");
		char where = IO.inputChar ("Would you like to go in the Large Intestines (v) or Veins (x)? ");
		if (where == 'v')

			largeIntestine ();
		else
			Veins ();
	}

	public void RBC ()
	{
		System.out.println ("\nYou are in the Red Blood Cells.");
		char where = IO.inputChar ("Would you like to go in the kidney (z) or Arteries (q)? ");
		if (where == 'q')

			Arteries ();
		else
			Kidney ();
	}

	public void Kidney ()
	//They will keep choosing different parts until they choose kidney, where they will find the second task to complete.
	{
		System.out.println(" _    _     _                  ");
		System.out.println("| |  (_)   | |                 ");
		System.out.println("| | ___  __| |_ __   ___ _   _ ");
		System.out.println("| |/ / |/ _` | '_ \\ / _ \\ | | |");
		System.out.println("|   <| | (_| | | | |  __/ |_| |");
		System.out.println("|_|\\_\\_|\\__,_|_| |_|\\___|\\__, |");
		System.out.println("                          __/ |");
		System.out.println("                         |___/ ");
		System.out.println("");

		IO.printSlow ("\nYou are in the Kidney and a stone is detected.",15);
		System.out.println("");
		System.out.println("   __      ");
		System.out.println("  /__)  ");
		System.out.println("");
		task2 ();
	}

	public void task2 ()
	//In this task they have to choose the correct amount of radiation to move forward.
	{
		IO.printSlow ("\nGood Going! You have arrived one more step closer to healing the human.",15);
		IO.printSlow ("\nNow you will have to determine the wavelenght radiation that Crispr (you) should release so that stone can come out through urine.",15);
		IO.printSlow ("Remember, that you are running short on time, so that's why you will have to make the right decision in just 8 tries.",15);
		IO.printSlow ("\nThe body requires a lazer beam between 1 and 100 magnitude. Try to guess it to disintegrate the stone.\n",15);

		System.out.println("");
		System.out.println("                                       ");
		System.out.println("|    |      /      /      .'      .'               ");
		System.out.println("|    |     |      /      /      .'                   ");
		System.out.println("|    /     /     /     .'     .'                ");
		System.out.println("|   |     |     /     /     .'         .-'         ");
		System.out.println("|   |     /    /    .'    .'        .-'              ");
		System.out.println("|   /    |    /    /    .'       .-'                ");
		System.out.println("|  |     /   /   .'   .'      .-'      _.-'                        ");
		System.out.println("|  |    |   /   /   .'     .-'     _.-'                         ");
		System.out.println("|  /    /  /  .'  .'    .-'    _.-'      _.--'                     ");
		System.out.println("| |    |  /  /  .'   .-'   _.-'     _.--'                       ");
		System.out.println("| |    / / .' .'  .-'  _.-'    _.--'    __.--'                 ");
		System.out.println("| |   | / / .' .-' _.-'   _.--'   __.--'    __..--'                ");
		System.out.println("              _.-'  _.--'   __.--'   __..--'                    ");
		System.out.println("               _.--'  __.--'  __..--'   __..--''                   ");
		System.out.println("                __.--' __..--'  __..--''                           ");
		System.out.println("                __..--' __..--''                                   ");
		System.out.println("                __..--''                                           ");
		System.out.println("               ----------------------------------   ");
		System.out.println("");

		int num = (int) (Math.random () * 100) + 1;
		int guessNum = 1;

		guessNum = 1;
		int count=0;
		num = (int) (Math.random () * 100) + 1;
		char guess = 'i';
		while (guess!='c')
		{
			int ans = IO.inputInt("Guess #" + guessNum + ":");
			//loop until they get it OR 8 tries
			if (ans > num)
			{
				System.out.println("That is too high.");
				guessNum++;
				count++;
			}
			else if (ans < num)
			{
				System.out.println("That is too low.");
				guessNum++;
				count++;
			}
			else 
			{
				System.out.println ("");
				System.out.println ("       _,,,,,,,_");
				System.out.println ("     ,88888888888,");
				System.out.println ("   ,888'       `888,");
				System.out.println ("   888' 0     0 `888");
				System.out.println ("  888             888");
				System.out.println ("  888      0      888");
				System.out.println ("  888  0,     ,0  888");
				System.out.println ("   888,  00000  ,888");
				System.out.println ("    '888,      ,888'");
				System.out.println ("      '8JGS8888888'");
				System.out.println ("        ````````");
				System.out.println ("");
				System.out.println("You got it!");
				System.out.println("\nIt only took " + guessNum + " guesses. Good Job.");
				guess='c'; 
				cast();
			}
			if (count>=8)
			{
				System.out.println ("\nYour time is up and you failed.");
				System.out.println ("");
				System.out.println ("     _,,,,,,,_ ");
				System.out.println ("  ,88888888888, ");
				System.out.println (" ,888'       `888, ");
				System.out.println (" 888' 0     0 `888 ");
				System.out.println ("888      0      888 ");
				System.out.println ("888             888 ");
				System.out.println ("888    ,000,    888 ");
				System.out.println (" 888, 0     0 ,888 ");
				System.out.println ("' 888,       ,888' ");
				System.out.println ("   '8JGS8888888' ");
				System.out.println ("      ```````` ");
				System.out.println ("");
				System.out.println ("Try the task again. ");
				castle ();
			}
			if (count==7)
			{
				//Show a warning dialog with the options OK, title 'Warning', 
				// and message 'You only have one chance to give the right answer.Click OK to continue':
				Object [] options = {"OK"};
				JOptionPane.showOptionDialog (null, "This is your last try. Click OK to continue", "Warning",
						JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
						null, options, options [0]);
			}
		}
	}

	public void cast ()
	//Once they clear this task; they will again search through the body parts to find the final problem with the human.
	{
		KIDNEY ();
	}

	public void KIDNEY ()
	{
		IO.printSlow ("\nYou are at present inside the kidney you just cured.",15);
		char where = IO.inputChar ("\nWould you like to go in the muscles (m) or elbow (e)? ");
		if (where == 'm')
			muscles ();
		else
			elbow ();
	}

	public void muscles ()
	{
		System.out.println ("\nYou are in the muscles.");
		char where = IO.inputChar ("Would you like to go in the knee (k) or calf (c)? ");
		if (where == 'k')

			knee ();
		else
			calf ();
	}
	public void elbow ()
	{
		System.out.println ("\nYou are in the Elbow.");
		char where = IO.inputChar ("Would you like to go in the shoulder (s) or neck (n)? ");
		if (where == 's')

			shoulder ();
		else
			neck ();
	}
	public void knee ()
	{
		System.out.println ("\nYou are in the knee.");
		char where = IO.inputChar ("Would you like to go in the toe (t) or ankle (a)? ");
		if (where == 't')

			toe ();
		else
			ankle ();
	}
	public void calf ()
	{
		System.out.println ("\nYou are in the Calf.");
		char where = IO.inputChar ("Would you like to go in the toe (t) or muscles (m)? ");
		if (where == 't')

			toe ();
		else
			muscles ();
	}
	public void shoulder ()
	{
		System.out.println ("\nYou are in the Shoulders.");
		char where = IO.inputChar ("Would you like to go in the ankle (q) or neck (n)? ");
		if (where == 'a')

			ankle ();
		else
			neck ();
	}
	public void neck ()
	{
		System.out.println ("\nYou are in the neck.");
		char where = IO.inputChar ("Would you like to go in the Wind pipe (w) or Spine (p)? ");
		if (where == 'w')

			windpipe ();
		else
			spine ();
	}
	public void toe ()
	{
		System.out.println ("\nYou are in the toe.");
		char where = IO.inputChar ("Would you like to go in the calf (c) or ankle (a)? ");
		if (where == 'c')

			calf ();
		else
			ankle ();
	}


	public void ankle ()
	{
		System.out.println ("\nYou are in the ankle.");
		char where = IO.inputChar ("Would you like to go in the knee (k) or spine (s)? ");
		if (where == 'k')

			knee ();
		else
			spine ();
	}

	public void spine ()
	{
		System.out.println ("\nYou are in the spine.");
		char where = IO.inputChar ("Would you like to go in the Bone Marrow (r) or toe (t)? ");
		if (where == 'r')

			BoneMarrow ();
		else
			toe ();
	}
	public void windpipe ()
	{
		System.out.println ("\nYou are in the Windpipe.");
		char where = IO.inputChar ("Would you like to go in the Bone Marrow (r) or elbow (e)? ");
		if (where == 'r')

			BoneMarrow ();
		else
			elbow ();
	}

	public void BoneMarrow ()
	//It will take the player a bit longer to find the last task that is inside bone marrow. 
	{
		System.out.println("");
		System.out.println(" You are being transferred deep inside the bone so it is taking a bit of time");
		System.out.println("");
		IO.printSlow ("88888888ba    ,ad8888ba,   888b      88 88888888888    88b           d88        db        88888888ba  88888888ba    ,ad8888ba,  I8,        8        ,8I  ",5);
		IO.printSlow ("88      '8b  d8''    `'8b  8888b     88 88             888b         d888       d88b       88      '8b 88      '8b  d8''    `'8b `8b       d8b       d8'  ",5);
		IO.printSlow ("88      ,8P d8'        `8b 88 `8b    88 88             88`8b       d8'88      d8'`8b      88      ,8P 88      ,8P d8'        `8b '8,     ,8'8,     ,8'   ",5);
		IO.printSlow ("88aaaaaa8P' 88          88 88  `8b   88 88aaaaa        88 `8b     d8' 88     d8'  `8b     88aaaaaa8P' 88aaaaaa8P' 88          88  Y8     8P Y8     8P    ",5);
		IO.printSlow ("88''''''8b, 88          88 88   `8b  88 88'''''        88  `8b   d8'  88    d8YaaaaY8b    88''''88'   88''''88'   88          88  `8b   d8' `8b   d8'    ",5);
		IO.printSlow ("88      `8b Y8,        ,8P 88    `8b 88 88             88   `8b d8'   88   d8 ' ' ' '8b   88    `8b   88    `8b   Y8,        ,8P   `8a a8'   `8a a8'     ",5);
		IO.printSlow ("88      a8P  Y8a.    .a8P  88     `8888 88             88    `888'    88  d8'        `8b  88     `8b  88     `8b   Y8a.    .a8P     `8a8'     `8a8'      ",5);
		IO.printSlow ("88888888P      `Y8888Y'    88      `888 88888888888    88     `8'     88 d8'          `8b 88      `8b 88      `8b    `Y8888Y'        `8'       `8'       ",5);	                                                                                                                                                                                                                                                                                                                                                                               
		System.out.println("");
		System.out.println("        _                                    _");
		System.out.println("       (_'----------------------------------'_)");
		System.out.println("       (_.==================================._)");
		System.out.println("");
		IO.printSlow ("\nYou are now in the Bone Marrow and a gene that seems to be the root cause of human's diseases is detected.",15);
		task3 ();
	}

	public void task3 ()
	//The last task is a little hard for the player to win and it explains how they have to first cure the root problem of the human's diseases.
	{
		IO.printSlow ("Congratulations! You have finally reached the final phase of the game.",15);
		System.out.println("");
		System.out.println ("   .* *.               `o`o`");
		System.out.println ("   *. .*              o`o`o`o      ^,^,^");
		System.out.println ("    * \\                `o`o`     ^,^,^,^,^");
		System.out.println ("       \\      ***       |       ^,^,^,^,^");
		System.out.println ("        \\    *****      |        //^,^,^");
		System.out.println ("         \\    ***       |       // ");
		System.out.println ("   ~@~*~@~        \\     |      //    ");
		System.out.println ("  ~*~@~*~@~*~      \\    |     //   ");
		System.out.println ("  ~*~@smd@~*~       \\   |    //       #$#$#   ");
		System.out.println ("  ~*~@~*~@~*~        \\  |   //       #$#$#$# ");
		System.out.println ("     ~@~*~@~\\        \\ |  //        #$#$#   ");
		System.out.println ("_____________\\________\\| //__________//__");
		System.out.println("");
		IO.printSlow("\nYou have to cure the person's genes (DNA) so that the Kiney and Brain you just cured can never be infected again as the genes are the root problem.",15);
		System.out.println("");
		System.out.println("`-:-.   ,-;\"`-:-.   ,-;\"`-:-.   ,-;\"`-:-.   ,-;");
		System.out.println("   `=`,'=/     `=`,'=/     `=`,'=/     `=`,'=/");
		System.out.println("     y==/        y==/        y==/        y==/");
		System.out.println("   ,=,-<=`.    ,=,-<=`.    ,=,-<=`.    ,=,-<=`.");
		System.out.println(",-'-'   `-=_,-'-'   `-=_,-'-'   `-=_,-'-'   `-=_v");
		System.out.println("");
		IO.printSlow ("To do so you will have to defeat the bad and harmful genes that do not want to be destroyed and live off of the human like a parasite.",15);
		System.out.println("");
		System.out.println("      @@@@@@@@@@@@@@@@@@");
		System.out.println("     @@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("   @@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(" @@@@@@@@@@@@@@@/      \\@@@/   @");
		System.out.println("@@@@@@@@@@@@@@@@\\      @@  @___@");
		System.out.println("@@@@@@@@@@@@@ @@@@@@@@@@  | \\@@@@@");
		System.out.println("@@@@@@@@@@@@@ @@@@@@@@@\\__@_/@@@@@");
		System.out.println(" @@@@@@@@@@@@@@@/,/,/./'/_|.\\'\\,\\");
		System.out.println("   @@@@@@@@@@@@@|  | | | | | | | |");
		System.out.println("                 \\_|_|_|_|_|_|_|_|");
		System.out.println("");
		IO.printSlow ("The evil DNA gene and You (Crispr) meet inside the bone marrow.",15);

		//In this task the DNA (evil) and Crispr (hero) will be given 40 points and they will have to choose an attack on each other.
		//It depends on their attack and what attack the DNA chooses, according to the attack someone will loose points.
		//The first one to loose all the points will loose the game and the one who has the most points by the end wins.
		int pikaHP = 40;
		int bulbaHP = 40;

		while (pikaHP >= 0 && bulbaHP >= 0)
		{

			if (pikaHP != 40 || bulbaHP != 40)
				IO.printSlow ("***** The battle continues.... *****",15);
			System.out.println (" DNA :\t\t" + pikaHP);
			System.out.println (" Crispr :\t" + bulbaHP);
			System.out.println ("");

			IO.printSlow ("What attack does the Crispr choose?",15);
			System.out.println ("(1) Bombardment ");
			System.out.println ("(2) Liquefaction ");
			System.out.println ("(3) Disintegration ");
			int choice = IO.inputInt ("Crispr's attack? ");

			int rand = (int) (Math.random () * 3) + 1;
			if (rand == 1)
				IO.printSlow ("DNA responds with a Disintegration",15);
			else if (rand == 2)
				IO.printSlow ("DNA responds with a Bombardment",15);
			else
				IO.printSlow ("DNA responds with a Liquefaction",15);

			System.out.println ("");
			int winner = (int) (Math.random () * 2) + 1;
			int pts = (int) (Math.random () * 10) + 1;
			if (winner == 1)
			{
				System.out.println("");
				IO.printSlow ("DNA wins.",15);
				System.out.println ("");
				System.out.println ("  ______");
				System.out.println ("((____ \\----");
				System.out.println ("((_____");
				System.out.println ("((_____ ");
				System.out.println ("((____\\ ----");
				System.out.println ("   /  /");
				System.out.println ("  (_(( ");
				System.out.println ("");

				bulbaHP = bulbaHP - pts;
			}
			else
			{
				System.out.println ("");
				IO.printSlow ("Crispr wins.",15);
				System.out.println ("    _");
				System.out.println ("  ( ((");
				System.out.println ("  \\ =\\");
				System.out.println (" __\\_ `-\\ ");
				System.out.println ("(____))(  \\----");   
				System.out.println ("(____)) _  ");
				System.out.println ("(____))");
				System.out.println ("(____))____/----");

				pikaHP = pikaHP - pts;
			}
			System.out.println ("");
		}
		IO.printSlow ("***** The battle is over!!! *****",15);
		System.out.println ("");

		if (pikaHP < 0)
		{
			IO.printSlow ("DNA has lost the battle!",15);
			System.out.println("");
			System.out.println("	");
			System.out.println("                     \\    |    |");
			System.out.println("                      \\ \"\"\"\"\"\"\"\"\"  /               ");
			System.out.println("                   \\  \"\"\"\"\"\"\"'\"\"\"\"/                ");
			System.out.println("                    \\\"\"\"\"'\"|'\"\"\"\"\"----             ");
			System.out.println("                    \"\\\"\"'\"\"|\"\"'\"\"\"                 ");
			System.out.println("              -----\"\"\"\\\"\"'\"\"\"\"\"\"\"\\                 ");
			System.out.println("                  \"\"\"'\"\"'\"\"'\"\"\"   \\                ");
			System.out.println("      e@@@@@@@@@^\"\"\"'\"\"\"\"\"'\"\"      \\               ");
			System.out.println("  _@@@@@@@@@@@  ee\"\"\"\"e\"\"\"\".@e                     ");
			System.out.println("_e@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                    ");
			System.out.println("@@@@@@\"@~~~~~~~~@@@.@@~~~~~~.@@e                  ");
			System.out.println("@ @@@@.@     . ..@@@@ .    . ..@                   ");
			System.out.println("@ @@@@.\"   ... ..@@@@e.   . ...@                   ");
			System.out.println("@.\"@@@@@eeeeeeee@@~ ~@@eeeeee@@@                   ");
			System.out.println(" @e.@@@@@@@@@@@@@@ | @@@@@@@@@'                    ");
			System.out.println("  @eeeeeee@@@@@@@[ : ]@@@@@'                       ");
			System.out.println("     \"'\"\"\"@@@@@@@::@::@@@@@                        ");
			System.out.println("    '\"\"\"\" @@@@@@@@@@@@@@@@@                        ");
			System.out.println("   \"\"'\"   v@@@@@@@@@v@@@v@@                        ");
			System.out.println("  \"'\"      V  VV  V  V    V");
			System.out.println("");
			IO.printSlow ("Crispr wins the battle!",15);
			System.out.println("");
			IO.printSlow ("Good job. You did it.",15);
			conclusion ();
			System.out.println("");                                                                      
		}
		else
		{
			IO.printSlow ("Crispr has lost the battle!",15);//They will have to try the task as they lost.
			System.out.println("");
			System.out.println("                 _________-----_____");
			System.out.println("       _____------           __      ----_");
			System.out.println("___----             ___------              \\");
			System.out.println("   ----________        ----                 \\");
			System.out.println("               -----__    |             _____)");
			System.out.println("                    __-                /     \\");
			System.out.println("        _______-----    ___--          \\    /)\\");
			System.out.println("  ------_______      ---____            \\__/  /");
			System.out.println("               -----__    \\ --    _          /\\");
			System.out.println("                      --__--__     \\_____/   \\_/\\");
			System.out.println("                              ----|   /          |");
			System.out.println("                                  |  |___________|");
			System.out.println("                                  |  | ((_(_)| )_)");
			System.out.println("                                  |  \\_((_(_)|/(_)");
			System.out.println("                                  \\             (");
			System.out.println("                                   \\_____________)");
			System.out.println("");
			IO.printSlow ("DNA wins the battle!",15);
			IO.printSlow("\nSince you lost to the DNA and couldn't finish your mutations, the human has died.",15);
			JOptionPane.showMessageDialog (null, createImageIcon ("youlost.jpg"), "Congratulations! You did it. :) ", JOptionPane.INFORMATION_MESSAGE);
			System.out.println ("");
			System.out.println ("     _,,,,,,,_ ");
			System.out.println ("  ,88888888888, ");
			System.out.println (" ,888'       `888, ");
			System.out.println (" 888' 0     0 `888 ");
			System.out.println ("888      0      888 ");
			System.out.println ("888             888 ");
			System.out.println ("888    ,000,    888 ");
			System.out.println (" 888, 0     0 ,888 ");
			System.out.println ("' 888,       ,888' ");
			System.out.println ("   '8JGS8888888' ");
			System.out.println ("      ```````` ");
			System.out.println("");
			System.out.println("Try the task again");
			cast ();
		}
	}

	public void conclusion ()
	//Tells the user that they won and gives the last ending background.
	{
		IO.printSlow ("VERY WELL DONE. You found all the blockages/hinderances and completed all you tasks.",15);
		IO.printSlow ("Also, You have done good mutations inside the human body and have successfully cured the human.",15);
		IO.printSlow ("With all your efforts and hardwork, you saved a life. The human appreciates you and thanks you with the bottom of his heart.",15);
		System.out.println ("");
		System.out.println ("       _,,,,,,,_");
		System.out.println ("     ,88888888888,");
		System.out.println ("   ,888'       `888,");
		System.out.println ("   888' 0     0 `888");
		System.out.println ("  888             888");
		System.out.println ("  888      0      888");
		System.out.println ("  888  0,     ,0  888");
		System.out.println ("   888,  00000  ,888");
		System.out.println ("    '888,      ,888'");
		System.out.println ("      '8JGS8888888'");
		System.out.println ("        ````````");
		System.out.println ("");

		IO.printSlow ("Therefore, you have WON the entire game!!!",30);
		JOptionPane.showMessageDialog (null, createImageIcon ("cup.png"), "Congratulations! You did it. :) ", JOptionPane.INFORMATION_MESSAGE);

		//Asks the user whether they want to play the whole game again or not.
		char again = IO.inputChar("Would you like to play the game again? (y/n)");
		{
			if (again == 'y')
				introduction();
			else
				System.out.println("\nGoodbye. Hope you enjoyed playing.");
			JOptionPane.showMessageDialog (null, createImageIcon ("gameover.jpg"), "Goodbye. :) ", JOptionPane.INFORMATION_MESSAGE);
		}	
	}
	protected static ImageIcon createImageIcon (String path)
	{ 
		java.net.URL imgURL = RPG.class.getResource (path);
		if (imgURL != null)
		{
			return new ImageIcon (imgURL);
		}
		else
		{
			System.err.println ("Couldn't find file: " + path);
			return null;
		}
	}
}