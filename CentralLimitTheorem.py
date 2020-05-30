# Enter your code here. Read input from STDIN. Print output to STDOUT
# Basically, the central limit theorem says, if  is a random variable that belongs to any distribution with mean  and standard deviation , then the sum of these random variables will converge to a normal distribution (provided n is big enough) with mean  and standard deviation .
# We can calculate the parameters of this normal distribution and find the cumulative probability for x = 9800. Here's my code written in python 3



import math

x = int(input())
n = int(input())
mu = int(input())
sigma = int(input())

mu_sum = n * mu 
sigma_sum = math.sqrt(n) * sigma

def cdf(x, mu, sigma):
    Z = (x - mu)/sigma
    return 0.5*(1 + math.erf(Z/(math.sqrt(2))))

print(round(cdf(x, mu_sum, sigma_sum), 4))
