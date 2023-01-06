package com.example.rupesh.constants;

import java.util.regex.Pattern;

public class constants {

    public static final String SUCCESS =
            "success";
    public static final String NO_ACCOUNT_FOUND =
            "NO ACCOUNT FOUND";
    public static final String INVALID_SEARCH_CRITERIA =
            "INVALID SEARCH CRITERIA";

    public static final String INSUFFICIENT_ACCOUNT_BALANCE =
            "No Balance";

    public static final String SORT_CODE_PATTERN_STRING = "[0-9]{2}-[0-9]{2}-[0-9]{2}";

    public static final String ACCOUNT_NUMBER_PATTERN_STRING = "[0-9]{8}";
    public static final Pattern SORT_CODE_PATTERN = Pattern.compile("^[0-9]{2}-[0-9]{2}-[0-9]{2}$");
    public static final Pattern ACCOUNT_NUMBER_PATTERN = Pattern.compile("^[0-9]{8}$");

    public static final String INVALID_TRANSACTION =
            "Account information is invalid";
    public static final String CREATE_ACCOUNT_FAILED =
            "Error in creating new account";
}
