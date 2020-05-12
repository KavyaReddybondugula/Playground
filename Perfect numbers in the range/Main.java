#include<iostream>
int main(){
  int a,b,i,j;
  std::cin>>a>>b;
  for(i=a;i<b+1;i++){
    int count=0;
    for(j=1;j<i;j++){
      if (i%j==0)
      count+=j;
    }
    if (count==i){
      std::cout<<i<<" ";
    }
  }
}