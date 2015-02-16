namespace * demo.person



enum Role {
  /**
  * Person who writes code
**/
  ENGINEER = 1,

  /**
  * Person who manages
**/
  OVERHEAD = 2,
}

/**
 * Represents someone who uses this system
 */
struct Person {
  /**
  * The full name of this person, first name then surname
  **/
  1: required string name;

  /**
  * If they are prepared to reveal it, their age
  **/

  2: optional i32 age;

  /**
  * What do they do?
**/
  3: optional Role role;

}

struct Team {
  1: required string name;
  2: optional list<Person> members;

}
