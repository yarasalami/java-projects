public void reverseString(char[] s) {
  //Input: s = ["h","e","l","l","o"]
  //Output: ["o","l","l","e","h"]
  int pointer1 = s.length - 1;
  int pointer2 = 0;
  char temp;
  while (pointer1 > pointer2) {
    temp = s[pointer2];
    s[pointer2] = s[pointer1];
    s[pointer1] = temp;
    pointer2++;
    pointer1--;
  }
}
