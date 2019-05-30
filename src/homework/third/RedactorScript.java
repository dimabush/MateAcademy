package homework.third;

public class RedactorScript {
  public static StringBuilder groupLinesByRoles(String[] rolesArray, String[] scriptArray) {
    StringBuilder resultScriptBuilder = new StringBuilder();
    for (int i = 0; i < rolesArray.length; i++) {
      resultScriptBuilder.append(rolesArray[i]).append(":\n");
      for (int j = 0; j < scriptArray.length; j++) {
        if (scriptArray[j].startsWith(rolesArray[i] + ":")) {
          String strToAppend = scriptArray[j].substring(rolesArray[i].length() + 1);
          resultScriptBuilder.append(j + 1).append(")").append(strToAppend).append('\n');
        }
      }
      resultScriptBuilder.append('\n');
    }
    return resultScriptBuilder;
  }
}
