package com.brindle.cavitygame.model;

import com.brindle.cavitygame.R;

public class Story {
    private Page[] mPages;

    public Story() {
        mPages = new Page[20];
        // %1$s placeholder

        // CABIN: Look around the Cabin
        mPages[0] = new Page(
                R.drawable.page0,
                "You awaken to the muffled sounds of waves and the distant cries of seagulls. The familiar smell of musty wood and the sea are thick in the air. Striking a match and lighting the lamp on the bedside table reveals that you are where you thought you were, your grandfather’s cabin. But how did you get here? And why?",
                new Choice("LOOK AROUND FOR CLUES", 1),
                new Choice(" ", 1));

        // NOTE 1: Finding the note in Cabin
        mPages[1] = new Page(
                R.drawable.page1,
                "You come upon a note on the table. On the front is written, \"%1$s\". You open the letter and begin to read..." +
                        "\n\n" +
                        "\"I took my boy to hear an echo, he wanted to hear one. I wanted him to.\"",
                new Choice("CONTINUE READING", 2),
                new Choice(" ", 2));

        // NOTE 2: Reading about the Cave
        mPages[2] = new Page(
                R.drawable.page1,
                "You recognize the handwriting to be your grandfather’s, and the reference. You remember the day long ago, when you rowed to Elder Island and shouted into the mouth of Canya Cave to hear your voices bounce around the darkness below. You were too afraid to enter the cave back then, the opening seemed to swallow the light around it, it looks like you’ll have to face your fears to get some answers.",
                new Choice("LEAVE THE CABIN", 3),
                new Choice(" ", 3));

        // SHORELINE: Kid runs into forest OR you head to dock
        mPages[3] = new Page(
                R.drawable.page2,
                "You know your grandfather’s old boat used to be moored at a dock a short walk away. On your way there you see a young boy in the distance standing at the shoreline; he's wearing a familiar looking jacket.",
                new Choice("APPROACH CHILD", 4),
                new Choice("CONTINUE TO DOCK", 5));

        // FOREST: Follow boy or head back to dock
        mPages[4] = new Page(
                R.drawable.page3,
                "As you begin walking towards the young boy, you call out to him. He must have been spooked because without even turning to look at you he begins to run down the beach before scrambling up an embankment and darting into a densely wooded area. You arrive at the treeline but there is no sign of the boy.\n",
                new Choice("HEAD BACK", 6),
                new Choice("CONTINUE INTO WOODS", 13));

        // DOCK: Walking to
        mPages[5] = new Page(
                R.drawable.page4,
                "You step foot on the dock, recalling the summer you spent here as a child. You remember the simpler days when there was an adventure around every corner, with your imagination filling in the blanks. You make your way down to the end of the dock, where an old row boat is tied up. You don’t know what lies ahead on Elder Island, but you need to find out.",
                new Choice("UNTIE BOAT", 11),
                new Choice("", 11));

        // CABIN 2 OUTSIDE: Go in or to dock
        mPages[6] = new Page(
                R.drawable.page6,
                "As you're heading to the dock you walk past the cabin, light emanates from the windows. You are fairly certain you extinguished the lantern, but aren't entirely sure.",
                new Choice("CHECK OUT CABIN", 7),
                new Choice("HEAD TO DOCK", 5));

        // CABIN 2 INSIDE: Cabin interior.
        mPages[7] = new Page(
                R.drawable.page0,
                "Upon entry, nothing looks amiss. Must have forgotten to turn the lantern off. You decide to lie down for a little while…",
                new Choice("WAIT UNTIL MORNING", 8),
                new Choice("", 8));

        // CABIN 2 INSIDE: Figure at bedside (NO PENDANT).
        // TODO: DEAD END
        mPages[8] = new Page(
                R.drawable.page10,
                "You open your eyes to see a dark figure standing over you, watching you sleep. Suddenly, you feel his teeth sink into either side of your head and everything goes dark.\n");

        // CABIN 2 INSIDE: Figure at bedside (HAS PENDANT)
        mPages[9] = new Page(
                R.drawable.page10,
                "You awake to a high pitched wail, the pendant around your neck is pulsing with energy. You look up and see the dark silhouette of an unknown figure reaching out towards you through the darkness. You quickly roll out of bed and scramble out of the cabin.",
                new Choice("RUN", 10),
                new Choice("", 10));

        // DOCK: Running to
        mPages[10] = new Page(
                R.drawable.page4,
                "Wasting no time you clamour across the planks of the dock, jumping into an old rowboat, and hastily untie the mooring line, pushing off into the water.",
                new Choice("ROW FOR YOUR LIFE", 11),
                new Choice("", 11));

        // STRANGE STALKER: Hurry getting boat into water
        mPages[11] = new Page(
                R.drawable.page11,
                "You turn back for a moment and see a figure standing ominously at the foot of the dock , it lets out a guttural cry that rings out into the sky, unlike anything you’ve heard before.. You pick up the pace to put as much distance between you and whatever this… thing is, as possible.",
                new Choice("ROW FASTER", 12),
                new Choice("", 12));

        // BOAT ON WATER: Reflect
        mPages[12] = new Page(
                R.drawable.page7,
                "The water is calm. You remember the summer you spent here as a child. You don’t know what lies ahead on Elder Island, but you need to find out.",
                new Choice("FLOAT ON", 16),
                new Choice("", 16));

        // SHRINE (DISTANCE): Closer to shrine or back to cabin
        mPages[13] = new Page(
                R.drawable.page5,
                "You begin to push your way through the trees, you can’t understand how the boy was able to disappear so quickly, as there is no path in sight. Brambles seemingly lash out and snag your clothing with every step, but you press on until the the growth becomes less dense. Through the mist you see the outline of a structure.",
                new Choice("INVESTIGATE STRUCTURE", 14),
                new Choice("TURN BACK", 6));

        // SHRINE (CLOSE UP): Sit at table
        mPages[14] = new Page(
                R.drawable.page18,
                "You approach the structure in the mist, and see that there are 7 pillars surrounding a raised deus. In the middle sits a table with 7 stone chairs seated around a large circular granite table, 2 of which have crumbled. You take a seat at the head of the table, you feel it slowly drop down about an inch into the stone below with a loud “ka-chunk”. The stone table in front of you splits to reveal a compartment in its center. A faint shine comes from within.",
                new Choice("REACH IN", 15),
                new Choice("", 15));

        // PENDANT: Grab Pendant
        // TODO: Pendant acquired.
        mPages[15] = new Page(
                R.drawable.page8,
                "You find an ornate pendant made out of silver with a large crystal attached to it. As you hold the charm in your hands you can almost feel it vibrate ever so slightly. You hope you’ll be able to sell it to a collector once you make it back to town.\n",
                new Choice("MAKE YOUR WAY BACK", 6),
                new Choice("", 6));

        // DOCK ON ISLAND: Arriving at the island, either tie up boat or investigate sounds
        mPages[16] = new Page(
                R.drawable.page12,
                "You slowly drift into the dock on Elder Island and begin making your way towards the mouth of the cave - or at least where it used to be.",
                new Choice("ASCEND HILLSIDE", 17),
                new Choice("", 17));

        // RESEARCH CENTER: follow boy or go into big building
        mPages[17] = new Page(
                R.drawable.page15,
                "After you crest the hill atop Elder Island you look down below and see some abandoned structures near where the mouth of Canya Cave once was, a lot has changed since you were last here. It doesn’t look like anyone has been here in years. As you begin your descent you see a glimmer of the same child from the beach before, standing in the doorway of the smaller of the building.",
                new Choice("FIND THE BOY", 18),
                new Choice("HEAD TO LARGE BUILDING", 18));

        // DEAD END PAGES
        mPages[18] = new Page(
                R.drawable.page5,
                "To be continued.");

    }

    public Page getPage(int index) {
        return mPages[index];
    }
}
