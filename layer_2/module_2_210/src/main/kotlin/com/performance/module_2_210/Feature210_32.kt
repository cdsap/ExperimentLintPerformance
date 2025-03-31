package com.performance.module_2_210

class Feature210UseCase0(
    private val repository: Feature210Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
