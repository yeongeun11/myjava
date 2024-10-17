package test;

public class Test3 {
    public static void main(String[] args) {

    // 210.101.236.164
    // 02. 65. EC. A4
    // shift operator : >>, <<
    int myIpAddr = 0xD265ECA4;
    // 와 & 연산자를 조합해서 ipv4 각 int 형 변수 IpAddr에 저장
    int ipAddr1 = (myIpAddr >> 24) & 0xFF; // D2, 65, EC, A4 -> D2
    int ipAddr2 = (myIpAddr >> 16) & 0xFF;
    int ipAddr3 = (myIpAddr >> 8) & 0xFF;
    int ipAddr4 = myIpAddr & 0xFF;
    }
}
