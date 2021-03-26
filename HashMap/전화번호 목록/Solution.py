def solution(phone_book):
    phone_book.sort()
    for phone_num1, phone_num2 in zip(phone_book, phone_book[1:]):
        if phone_num2.startswith(phone_num1):
            return False
    return True
