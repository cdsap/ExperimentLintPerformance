package com.performance.module_1_37

class Feature37UseCase1(
    private val repository: Feature37Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
