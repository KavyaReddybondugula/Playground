#include<iostream>
using namespace std;
int main()
{
  string s,k;
  int n=0;
  while(s!="####"){
    cin>>s;
    if(n==0){
    k=s;
    cout<<k;
    }
    else{
      if(s[0]==k[(k.size())-1]){
        cout<<"\n"<<s;
        k=s;
      }
      else{
        break;
      }
    }
    n++;
  }
    
}