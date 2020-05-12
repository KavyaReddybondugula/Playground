#include<iostream>
int main(){
  int a,b,c,i,sum1=0;
  std::cin>>a;
  std::cin>>b;
  c=a+b;
  for(i=1;i<c;i++){
    if(c%i==0){
      sum1=sum1+i;
    }
  }
  if (sum1==c){
    std::cout<<"They can read the message";
  }
  else{
    std::cout<<"They can't read the message";
  }
}
  