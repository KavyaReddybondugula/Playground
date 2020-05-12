#include <iostream>
int main()
{
char str[100],rev[100];     
int n=0;  
std::cin.getline(str,100);
 while (str[n] != '\0') {
   n++;
 }
for (int i=0;i<n;i++){
  rev[n-i-1]=str[i];
}
std::cout<<rev;
}