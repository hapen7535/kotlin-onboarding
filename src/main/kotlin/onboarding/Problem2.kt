package onboarding

//기능 목록
/*
    1. 처음 들어온 cryptogram에 연속된 중복 문자가 있는지 확인
    2. 1.에서 연속 중복 문자가 있다면 제거
    3. 2.에서 제거했음에도 연속 중복 문자가 있다면 제거
    4. 연속 중복 문자가 없을 때까지 3.을 반복
 */

//예외 사항
/*
    1. cryptogram 중 알파벳 대문자가 포함된 경우
    2. cryptogram의 길이가 1~1000의 범위를 벗어나는 경우
 */

fun solution2(cryptogram: String): String {
    //기능 구현
    val builder = StringBuilder()

    //3. 2.에서 제거했음에도 연속 중복 문자가 있다면 제거, 4. 중복 문자가 없을 때까지 제거
    for(alphabet in cryptogram){ //1. 처음 들어온 cryptogram에 연속된 중복 문자가 있는지 확인
        if(builder.last() == alphabet) builder.deleteCharAt(builder.length -1) //2. 1.에서 연속 중복 문자가 있다면 제거
        else builder.append(alphabet)
    }
    return builder.toString()
}

