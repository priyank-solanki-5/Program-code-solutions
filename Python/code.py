#basic maths
#1.odd-even
"""inp = int(input("enter a number"))
print(f"your number is {inp}")
if (inp%2==0):
    print("even")
else:
    print("odd")"""

#2.prime-number
# inp = int(input("enter a number "))
# is_prime=1
# if(inp<=1):
#     is_prime=0
# else:
#     for i in range(2,int(inp**0.5)+1):
#         if (inp%i==0):
#             is_prime=0
#         else:
#             is_prime=1
# if(is_prime==0):
#     print("number is not prime")
# else:
#     print("number is prime")


#count number
# num = 13236464646
# count = 0
# while num > 0:
#     count+=1
#     num//=10
# print(f"count of number is {count}")

#amangstrong number

# num = 1588
# temp = num
# sum = 0

# while temp > 0:
#     digit=temp%10
#     sum+=digit**3
#     temp//=10

# if(sum==num):
#     print("this is amangstrong number")
# else:
#     print("this number is not amangstrong")

#find factorial of number

# num = int(input("enter a number "))
# fact=1
# for i in range(1,num+1):
#     fact*=i
# print(f"factorial is {fact}")

#pelindrome number 123 321 -> not 121 121 -> yes

# num = 121
# original = num
# rev = 0

# while num>0:
#     digit=num%10
#     rev=rev*10+digit
#     num//=10
# if(original==rev):
#     print("pelindrome")
# else:
#     print("not pelindrome")

# num = 2001
# rev=0
# temp = num
# while temp>0:
#     digit = temp%10
#     rev = (rev*10)+digit
#     temp//=10
# print(f"reverce number is {rev}")

#count voval and consonents

# line = "hello priyank"

# vovels = 0
# consonents = 0

# for ch in line.lower():
#     if ch.isalpha():
#         if ch in "aeiou":
#             vovels+=1
#         else:
#             consonents+=1

# print(f"number of vovel is {vovels}")
# print(f"number ofconsonents is {consonents}")

#first unique char in string.

# a = "hello$"

# for c in a:
#     if 33<= ord(c)<= 64:
#         print("this is unique")

      