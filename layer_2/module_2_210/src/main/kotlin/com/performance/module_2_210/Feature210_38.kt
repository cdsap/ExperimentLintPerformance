package com.performance.module_2_210

class Feature210UseCase2(
    private val repository: Feature210Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
