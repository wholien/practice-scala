package exercises

object Palindrome {
  /**
   *  True if the string is a palindrome, after removing all non-alphabetic
   *  characters (e.g., spaces, numbers, and punctuation).
   *
   *  Hint: the Scala collections API is your friend
   *  http://docs.scala-lang.org/overviews/collections/overview.html
   */
  def isPalindrome(s: String): Boolean = {
    //s == s.reverse
    isPalindromeHelper(s.filter(_.isLetter).toLowerCase())
  }

  def isPalindromeHelper(s: String): Boolean = s match {
    case s if s.length == 0 => true
    case s if s.length == 1 => true
    case _ => (s.head == s.last && isPalindromeHelper(s.tail.init))
  }
}
