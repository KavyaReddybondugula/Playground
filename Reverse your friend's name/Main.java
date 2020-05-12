#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
 char str[100];
 cin.getline(str,100);
  int n=0;
  while(str[n]!='\0'){
        n++;
        }
  for(int i=0;i<n;i++){
    cout<<str[n-i-1];
  }
}