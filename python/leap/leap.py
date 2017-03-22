def is_leap_year(arg):
    if arg % 4 == 0 and arg % 100 != 0 or arg % 400 == 0:
        return True
    else:
        return False
