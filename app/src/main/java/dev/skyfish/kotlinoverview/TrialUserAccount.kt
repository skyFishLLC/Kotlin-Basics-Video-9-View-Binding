package dev.skyfish.kotlinoverview

class TrialUserAccount(
    username: String,
    password: String,
): UserAccount(
    username, password,
) {
    var trialDuration = 14

    override fun userToString(): String {
        return "username = $username\npassword = $password\nsubActive = $subActive\ntrial Duration = $trialDuration"
    }

}