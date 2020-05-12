#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s,r;
  int n=0,k=0;
  cin>>s;
  cin>>r;
  while(s[n]!='\0'){
    n++;
  }
  for(int i=0;i<n;i++){
    if(s[i]==r[n-i-1]){
      k++;
    }
  }
  if(k==n){
    cout<<"It is correct";
  }
  else{
    cout<<"It is wrong";
  }
}