package com.performance.module_1_93

class Feature93UseCase1(
    private val repository: Feature93Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
