#include <bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    int a[n+5];
    for(int i = 1; i <= n; i++){
        a[i] = 0;
    }
    while(true){
        int check1 = 0;
        for(int i = 1 ; i <= n/2; i++){
            if(a[i] != a[n-i+1]){
                check1 = 1;
                break;
            }
        }

        if(check1 == 0){
            for(int i = 1; i <= n; i++){
                cout << a[i];
                if(i != n) cout << " ";
                else cout << "\n";
            }
        }
        
        int check2 = 0;
        for(int i = n; i >= 1; i --){
            if(a[i] == 0){
                a[i] = 1;
                check2 = 1;
                break;
                
            }
            else a[i] = 0;
        }
        if(check2 == 0) break; 
    }
    return 0;
}