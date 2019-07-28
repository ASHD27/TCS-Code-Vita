//
//solutionD.cpp
//
#include<bits/stdc++.h>
using namespace std;

void printPatterLineNo(vector<vector<char>> stars, vector<vector<long int>> multipleOf10, vector<vector<long int>> multipleOf10SpecialCase, long int lineNo)
{
    if(lineNo != 0)
    {
        for(int i = 0 ; i < stars[lineNo - 1].size(); i++)
        {
            cout << stars[lineNo - 1][i];
        }
     }

    for(int i = 0 ; i < multipleOf10[lineNo].size(); i++)
    {
         cout << multipleOf10[lineNo][i]; 
    }
    for(int i = 0 ; i < multipleOf10SpecialCase[lineNo].size(); i++)
    {
         cout << multipleOf10SpecialCase[lineNo][i]; 
    }
    cout << endl;
}

int main()
{
    int n;
    long int tens = 0, i, j;

    vector<vector<char>> stars;
    vector<char> tempStars;
    
    vector<vector<long int>> multipleOf10;
    vector<long int> tempMultipleOf10;

    vector<vector<long int>> multipleOf10SpecialCase;
    vector<vector<long int>> multipleOf10SpecialCaseReverse;
    vector<long int> tempMultipleOf10SpecialCase;
    
    cin >> n;

    for(i = 1 ; i < n ; i++ )
    {
        for(j = 0 ; j < i * 2 ; j++)
        {
            tempStars.push_back('*');
        }
        stars.push_back(tempStars);
        tempStars.clear();
    }

    for( i = n ; i >= 0 ; i-- )
    {
        for( j = 1 ; j <= i ; j++)
        {
         tens = tens + 10;
         tempMultipleOf10.push_back(tens);
        }
        multipleOf10.push_back(tempMultipleOf10);
        tempMultipleOf10.clear();
    }

    for( i = 1 ; i <= n ; i++ )
    {
        for( j = 1 ; j <= i ; j++)
        {
            tens = tens + 10;
            if(j == i)
            {
                long int tensSpecial = tens / 10;
                tempMultipleOf10SpecialCase.push_back(tensSpecial);
            }
            else
                tempMultipleOf10SpecialCase.push_back(tens);
           
        }
        multipleOf10SpecialCase.push_back(tempMultipleOf10SpecialCase);
        tempMultipleOf10SpecialCase.clear();
    }

    for( i = multipleOf10SpecialCase.size() - 1; i >= 0 ; i--)
		multipleOf10SpecialCaseReverse.push_back(multipleOf10SpecialCase[i]);

    for( i = 0 ; i < n ; i++)
         printPatterLineNo(stars, multipleOf10, multipleOf10SpecialCaseReverse, i);

    return 0;
}
