#include <cstring>
#include <iostream>
using namespace std;
int main()
{
  char p[100];
  cin.getline(p,100);
  int count=0,co=0;
  while(p[count]!='\0'){
    if(p[count]==' '){
      co++;
    }
    count++;
  }
  if(co<9){
    cout<<"Caption eligible for the contest";
  }
  else{
    cout<<"Caption not eligible for the contest";
  }
  
   
}