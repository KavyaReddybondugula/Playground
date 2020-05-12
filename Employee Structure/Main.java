#include<iostream>
using namespace std;
struct s{
  char name[100],des[100];
  int id,age;
  float sal;
};
int main()
{
  s s1;
  cin.getline(s1.name,100);
  cin>>s1.id>>s1.age;
  cin>>s1.des;
  cin>>s1.sal;
  cout<<"Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:\nEmployee Details\n";
  cout<<"Name of the Employee : "<<s1.name;
  cout<<"\nID of the Employee : "<<s1.id;
  cout<<"\nAge of the Employee : "<<s1.age;
  cout<<"\nDesignation of the Employee : "<<s1.des;
  cout<<"\nSalary of the Employee : "<<s1.sal;
}