package com.huni.forblog;

public class EnumTest {
    public enum Color {
        RED, GREEN, BLUE, YELLOW
    }

    //열거형에 멤버를 추가
    public enum Country {
        //국가 수도 및 국가 번호를 반환
        KOREA("seoul", 82),
        JAPAN("tokyo", 81),
        CHINA("beijing", 86);

        public String capital;
        public int countryNumber;

        Country(String capital, int countryNumber) {
            this.capital = capital;
            this.countryNumber = countryNumber;
        }

        public String getCapital() {
            return capital;
        }

        public int getCountryNumber() {
            return countryNumber;
        }
    }

    public static void main(String[] args) {
        Color red = Color.RED;

        switch (red) {
            case RED -> System.out.println("red!!");
            case BLUE -> System.out.println("blue!!");
            case GREEN -> System.out.println("green!!");
            case YELLOW -> System.out.println("yellow!!");
            default -> System.out.println("error!!");
        }

        Country koreaObject = Country.KOREA;
        Country japanObject = Country.JAPAN;
        Country chinaObject = Country.CHINA;

        System.out.println("korea - " + koreaObject.capital + ", number- " + koreaObject.countryNumber);
        System.out.println("japan - " + japanObject.capital + ", number- " + japanObject.countryNumber);
        System.out.println("china - " + chinaObject.capital + ", number- " + chinaObject.countryNumber);
    }
}


//red!!
//korea - seoul, number- 82
//japan - tokyo, number- 81
//china - beijing, number- 86
