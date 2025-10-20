class Solution{
  public boolean(String note, String magazin) {
    char[] map = new char[26];
    for(char c : magazine.toCharArray()) {
      map[c - 'a']++;
    }
    for(char c : note.toCharArray()) {
      if(map[c - 'a'] == 0) {
        return false;
      }
      map[c - 'a']--;
    }
    return false;
  }
}
