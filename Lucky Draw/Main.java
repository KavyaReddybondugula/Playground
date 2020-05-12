#include<iostream>
int main(){
  int a,count=0;
  std::cin>>a;
  for(int i=1;i<a;i++){
    if(a%i==0){
      count++;
    }
  }
  if (count==1){
    std::cout<<"Eligible";
  }
  else{
    std::cout<<"Not eligible";
  }
}