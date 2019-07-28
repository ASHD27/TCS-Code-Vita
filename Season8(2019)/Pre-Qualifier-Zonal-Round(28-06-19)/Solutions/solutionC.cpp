//
//SolutionC.cpp
//
#include<bits/stdc++.h>
using namespace std;

int main()
{
    short int noOfTestcases;
    long int n[noOfTestcases], i, j;
    vector<vector<long int> > divisors;
    vector<long int> temp;

    cin >> noOfTestcases;

    for(i = 0 ; i < noOfTestcases ; i++)
        cin >> n[i];
    
    for(i = 0 ; i < noOfTestcases; i++)
    {
        for(j = 1 ; j <= sqrt(n[i]); j++)
        {
            if(n[i] % j == 0)
            {
	        if(j != n[i] / j )
		{
                   temp.push_back(j);
	           temp.push_back(n[i]/ j);
		}
	        else 
	           temp.push_back(j);
            }
            sort(temp.begin(), temp.end());
	}
	divisors.push_back(temp);
        temp.clear();	 
    }
    
    for(int i = 0 ; i < divisors.size() ; i++)
    {
        for(int j = 0 ; j < divisors[i].size() ; j++)
	    cout << divisors[i][j] << " ";
	cout << endl;
    }

    return 0;
}
