//
//solutionB.cpp
//
//
//
#include<iostream>
#include<vector>
#include<limits>
#include<string>
using namespace std;

int main()
{
    int noOfTestCases, i, j;
    vector <string> p;
    vector <string> s;
    string str, tempP;
    
    cin >> noOfTestCases;
    cin.ignore(numeric_limits<streamsize>::max(),'\n'); 
 
    for ( i = 0 ; i < noOfTestCases ; i++)
    {
        cin >> str;
        p.push_back(str);
        cin >> str;
        s.push_back(str);
    }
    for( i = 0 ; i < noOfTestCases ; i++)
    {
     tempP = p[i];
     for ( j = 0 ; j < tempP.length() ; j++)
     {
        size_t found = s[i].find(tempP[j]); 
        if (found != string::npos) 
        cout << tempP[j];
     }
     if( i != noOfTestCases - 1)
     cout << endl;
    }

    return 0;
}