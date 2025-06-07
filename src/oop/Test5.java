package oop;

class ElectronicDevice {
    // 전자기기의 공통 속성/기능
}

// 하위 1단계: 컴퓨터, 스마트폰
class Computer extends ElectronicDevice {
    // 컴퓨터 관련 속성/기능
}

class Smartphone extends ElectronicDevice {
    // 스마트폰 관련 속성/기능
}

// 하위 2단계: 데스크탑, 노트북(Computer의 하위)
class Desktop extends Computer {
    // 데스크탑 관련 속성/ 기능
}

class Laptop extends Computer {
    // 노트북 관련 속성/기능
}

// 하위 2단계: 안드로이드폰, 아이폰 (Smartphone의 하위)
class AndroidPhone extends Smartphone {
    // 안드로이드폰 관련 속성/기능
}

class Iphone extends Smartphone{
    // 아이폰 관련 속성/기능
}
