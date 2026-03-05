def CanTravel(gas,cost):
    total_gas=total_cost=tank=start=0
    for i in range(len(gas)):
        total_gas+=gas[i]
        total_cost+=cost[i]
        tank+=gas[i]-cost[i]
        if tank<=0:
            start=i+1
            tank=0
    return start if total_gas>=total_cost else -1

gas=[1,2,3,4,5]
cost=[3,4,5,1,2]
print(CanTravel(gas,cost))