package com.performance.module_2_213

class Feature213UseCase1(
    private val repository: Feature213Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
