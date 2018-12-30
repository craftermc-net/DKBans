package ch.dkrieger.bansystem.lib.filter;

public enum FilterOperation {

    CONTAINS(),
    EQUALS(),
    STARTSWITH(),
    ENDSWITH();

    public static FilterOperation ParseNull(String parse){
        try{
            return valueOf(parse.toUpperCase());
        }catch (Exception e){}
        return null;
    }

}
