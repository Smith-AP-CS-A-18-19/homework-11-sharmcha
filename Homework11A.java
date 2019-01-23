public class Homework11A extends Homework11{
  public Homework11A(){
    super();
  }

  //problem 4:
  public int problem4(){
    int sum = 0;
    for(int i = 0; i < getList().size(); i++){
      sum += getList().get(i);
    }
    return sum;
  }

  //problem 5:
  public void problem2(int n) {
    int i = 0;
    while (i < getList().size()) {
      int num = getList().get(i);
      if ((n % num) != 0) {
        getList().remove(i);
      } else {
        i++;
      }
    }
  }
}
