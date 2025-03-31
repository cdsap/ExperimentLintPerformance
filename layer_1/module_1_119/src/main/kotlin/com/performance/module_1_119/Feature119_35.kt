package com.performance.module_1_119

class Feature119UseCase1(
    private val repository: Feature119Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
