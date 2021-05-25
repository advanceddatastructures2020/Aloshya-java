class dog
{
  //instance variables
  string name;
  int age;

  //constructor declaration of calss
  public dog(Sring name,int age)
  {
      this.name=name;
      this.age=age;
  }
  public void getname()
  {
   	System.out.println(name);
  }
  public void getage()
  {	
  	System.out.println(age);
   }
public static void main(String a[])
{
   Dog tuffy = new Dog("tuffy",5);
   tuffy.getname();
}
}