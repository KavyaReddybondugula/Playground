#include<iostream>
int main(){
  int a,b,c,d,e,f,g;
  std::cin>>a>>b>>c>>d>>e;
  switch(a){
    case 1:
      f=(b+d);
      g=(c+e);
      if(g>0){
      std::cout<<f<<"-"<<abs(g)<<"i";
      }
      else{
        std::cout<<f<<"+"<<abs(g)<<"i";
      }
      break;
    case 2:
      f=(b-d);
      g=(c-e);
      if(g>0){
      std::cout<<f<<"+"<<abs(g)<<"i";
      }
      else{
        std::cout<<f<<"-"<<abs(g)<<"i";
      }
      break;
    case 3:
      f=((b*d)-(c*e));
      g=((c*d)+(b*e));
      if (g>0){
      std::cout<<f<<"+"<<abs(g)<<"i";
      }
      else{
        std::cout<<f<<"-"<<abs(g)<<"i";
      }
      break;
    default:
      std::cout<<"Invalid choice";
      break;
  }
}
  
  