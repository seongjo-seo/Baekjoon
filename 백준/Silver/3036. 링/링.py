
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def main():

    N = int(input())
    radius = list( map( int, input().split() ) )

    first = radius[0]

    for items in radius[1:]:
        radius_gcd = gcd(first, items)
        numerator = first // radius_gcd
        denominator = items // radius_gcd
        print(f"{numerator}/{denominator}")

if __name__ == "__main__":
    main()
