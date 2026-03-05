# ## python data structure revision.
# print("data structure revision")
# list1 = ["priyank",33,"solanki",9979684555]
# print(list1)
# list2 = ["mehulbhai","solanki",54,9725625750]
# print(list2)
# ## list compriantion
# print(list1[2:-1])
# print(list2[1:-2])
# list3 = []
# list3 = list1[2:-1]+list2[1:-2]
# print(list3)
# ## list methods
# list3.append(21)
# print(list3)
# list3.copy()
# print(list3)
# list1.insert(3,"bca")
# print(list1)
# ## set methods
# print("set method")
# set1 = {"priyank","darshan",55,77,87}
# set2 = {"priyank","mca",44,78,55}
# set1.add("mca")
# print(set1)
# print(set2)
# print(set1.difference(set2))
# print(set1.intersection())
# print(set1.union())

list1=[20,30,10,54,87]
for i in range(0,len(list1)+1):
    for j in range(0,len(list1)-i):
          if(list1[i]<list1[j]):
               temp=list1[i]
               list1[i]=list1[j]
               list1[j]=temp
print("sorted list is given below")
print(list1)
print("second large number is given below")
print(list1[-2:-1])


#insert n number in list
# i=int(input("enter a value of i  "))
# list1=[0]*i
# val=0
# for i in range(0,i):
#     val=input("enter a number  ")
#     list1[i]=val
# print(list1)

# i=int(input("enter a number of row "))
# j=int(input("enter a number of column "))
# for i in range(1,i+1):
#     for j in range(1,i+1):
#         print(j,end=" ")
#     print(end="\n")

# num = int(input("enter a number "))
# fact = 1
# for i in range(1,num+1):
#     fact*=i
# print(fact)

# list1 = [20,10,5,30,25,40,35]
# print(list1[::-1])

# a = int(2.2)
# print(a)