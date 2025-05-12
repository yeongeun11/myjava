def stock_simulator():
    # 입력 받기
    initial_capital_stock = int(input("초기 자본금을 입력하세요: "))
    stock_price = int(input("주식 가격을 입력하세요: "))
    num_stock_purchase = int(input("구매할 주식 수를 입력하세요: "))
    price_stock_time = int(input("판매할 때의 주식 가격을 입력하세요: "))
    
    # 총 구매 비용 계산하기
    total_purchase_cost = stock_price * num_stock_purchase

    # 남은 자본금 계산하기
    remaining_capital_stock = initial_capital_stock - total_purchase_cost

    # 총 판매 비용 계산
    total_sales_amount = price_stock_time * num_stock_purchase
    
    # 이익 또는 손실 계산하기
    estimated_profit_loss = price_stock_time * num_stock_purchase - total_purchase_cost
    
    # 결과 출력
    print(f"주식 구매 후 남은 자본금: {float(remaining_capital_stock):.2f}")
    print(f"예상 이익: {float(estimated_profit_loss):.2f}")
    
    # 추가 출력 
    if estimated_profit_loss > 0:
        print("예상되는 이익입니다. ")
    else:
        print("예상되는 손실입니다. ")
        
stock_simulator()



