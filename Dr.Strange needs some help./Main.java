#include<iostream>
int main(){
  int a,b,c,k;
  std::cin>>a>>b>>c;
  k=a;
  for(int i=1;i<b;i++){
    k=k*a;
  }
  if (k>=c)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}