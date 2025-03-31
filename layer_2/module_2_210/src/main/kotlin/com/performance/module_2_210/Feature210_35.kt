package com.performance.module_2_210

class Feature210UseCase1(
    private val repository: Feature210Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
