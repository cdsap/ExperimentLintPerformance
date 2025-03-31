package com.performance.module_1_106

class Feature106UseCase0(
    private val repository: Feature106Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
