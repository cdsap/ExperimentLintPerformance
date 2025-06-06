package com.performance.module_0_37

class Feature37UseCase2(
    private val repository: Feature37Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
