import java.util.ArrayList;
//we can’t use primitive types in an ArrayList like int -> we need Integer
//ArrayList comes with an add() method which inserts an element into
//note that an error will occur if we try to insert a value at an index that does not exist.
//assortment is an ArrayList that can store different values because we do not specify its type during initialization.
//ArrayList assortment = new ArrayList<>();
// use .size() to find the size of an arraylist
//For ArrayLists, bracket notation won’t work. Instead, we use the method get() to access an index
//Using the set method we change a value of an index  sherlocksToDos.set(1,"listen to Dr. Watson for amusement");
//Using .remove() we remove a value of an arraylist, specify index or value itself
//use indexOf() to get the position of a value

public class ArraysListLearn {
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("Black Angels");
        desertIslandPlaylist.add("Artemis");
        desertIslandPlaylist.add("HeartStrings");
        desertIslandPlaylist.add("Release");
        desertIslandPlaylist.add("HereToStay");
        desertIslandPlaylist.add("Ramses");
//playlist has 6 songs
        System.out.println(desertIslandPlaylist);
//printing the size
        System.out.println(desertIslandPlaylist.size());
        //we remove one song from the playlist
        desertIslandPlaylist.remove("Release");
        //we check the size again
        System.out.println(desertIslandPlaylist.size());
        //we check the index
        System.out.println(desertIslandPlaylist.indexOf("Artemis"));
        //we put the Song in an empty variable so we can replace it in the playlist
        String tempA = desertIslandPlaylist.get(1);
        //replace the value
        desertIslandPlaylist.set(1, desertIslandPlaylist.get(4));
        System.out.println(desertIslandPlaylist);
//swap places
        desertIslandPlaylist.set(4, tempA);

        System.out.println(desertIslandPlaylist);

  /*Child Classes in Arrays and ArrayLists

Monster dracula, wolfman, zombie1;

dracula = new Vampire();
wolfman = new Werewolf();
zombie1 = new Zombie();

Monster[] monsters = {dracula, wolfman, zombie1};

    }
    for (Monster monster : monsters) {
      monster.attack();
      }
   */

    }
}