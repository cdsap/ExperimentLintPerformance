package com.performance.module_0_37

class Feature37UseCase0(
    private val repository: Feature37Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
