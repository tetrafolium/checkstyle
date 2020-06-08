package com.puppycrawl.tools.checkstyle.filters.suppresswithnearbycommentfilter;

public class InputSuppressWithNearbyCommentFilterById {

     // @cs-: ignore (reason)

     // @cs-: violation (No NPE here)

    int line_length = 100; // Suppression @cs-: ignore (reason)

     // Suppression @cs-:
    /*
        Suppression @cs-: ignore (reason)*/

     // @cs-: ignore (allow DEF)
     // @cs-: ignore (allow xyz)
}
