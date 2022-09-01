"""
public static int factorial(int n){
        int x;
        if (n == 0){
            x = 1;
        }
        else{
            x = n*factorial(n-1);
        }
        return x;
    }
"""

def factorial(n):
    if n == 0:
        x = 1
    else:
        x = n*factorial(n-1)
    return x

print(factorial(5))

# Java, Python, JavaScript, C#

