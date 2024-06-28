class Science extends Faculty
{
    float bonus = 2000;
    public static void main(String args[]){
        Science obj = new Science();
        System.out.println("Salary:" + obj.salary);
        System.out.println("Bonus:" + obj.bonus);
    }
}